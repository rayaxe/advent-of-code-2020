import java.lang.IllegalArgumentException

fun day5Part1(seats: List<String>): Long {
    return seats
        .map { findSeatNumber(it) }
        .maxOrNull() ?: 0
}

fun day5Part2(seats: List<String>): Long {
    val seatNumbers = seats
        .map { findSeatNumber(it) }
        .sorted()
    return findMissingNumber(seatNumbers)
}

fun findSeatNumber(seat: String): Long {
    val row = find(seat.substring(0..6), 0, 127)
    val col = find(seat.substring(7..9), 0, 7)
    return row * 8L + col
}

private tailrec fun find(tail: String, lower: Int, upper: Int): Int {
    if (tail.isEmpty()) {
        return lower
    }
    val head = tail[0]
    val half = ((upper - lower) / 2) + 1
    val bounds = when (head) {
        'F', 'L' -> Pair(lower, upper - half)
        'B', 'R' -> Pair(lower + half, upper)
        else -> throw IllegalArgumentException("Unexpected character: '$head'")
    }
    return find(tail.drop(1), bounds.first, bounds.second)
}

private fun findMissingNumber(numbers: List<Long>): Long {
    var next = numbers[0]
    for (number in numbers) {
        if (number != next) {
            break
        }
        next++
    }
    return next
}
