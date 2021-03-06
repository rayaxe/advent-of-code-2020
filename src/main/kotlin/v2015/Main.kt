package v2015

import java.io.File
import java.nio.charset.Charset

@ExperimentalUnsignedTypes
@ExperimentalStdlibApi
fun main() {
//    println(day01Part1(readLinesFromFile("day01.txt").first()))
//    println(day01Part2(readLinesFromFile("day01.txt").first()))
//    println(day02Part1(readLinesFromFile("day02.txt")))
//    println(day02Part2(readLinesFromFile("day02.txt")))
//    println(day03Part1(readLinesFromFile("day03.txt").first()))
//    println(day03Part2(readLinesFromFile("day03.txt").first()))
//    println(day04("iwrupvqb"))
//    println(day04("iwrupvqb", 6))
//    println(day05Part1(readLinesFromFile("day05.txt")))
//    println(day05Part2(readLinesFromFile("day05.txt")))
//    println(Day06.part1(readLinesFromFile("day06.txt")))
//    println(Day06.part2(readLinesFromFile("day06.txt")))
//    println(Day07.part1(readLinesFromFile("day07.txt")))
//    println(Day07.part2(readLinesFromFile("day07.txt"), bValue = 3176.toUShort()))
//    println(Day08.part1(readLinesFromFile("day08.txt")))
//    println(Day08.part2(readLinesFromFile("day08.txt")))
//    println(Day09.part1(readLinesFromFile("day09.txt")))
//    println(Day09.part2(readLinesFromFile("day09.txt")))
//    println(Day10.part1("3113322113"))
//    println(Day10.part2("3113322113"))
//    println(Day11.part1("hxbxwxba"))
//    println(Day11.part2("hxbxwxba"))
//    println(Day12.part1(readLinesFromFile("day12.txt")))
//    println(Day12.part2(readLinesFromFile("day12.txt")))
//    println(Day13.part1(readLinesFromFile("day13.txt")))
//    println(Day13.part2(readLinesFromFile("day13.txt")))
//    println(Day14.part1(readLinesFromFile("day14.txt"), 2503))
//    println(Day14.part2(readLinesFromFile("day14.txt"), 2503))
//    println(Day15.part1(readLinesFromFile("day15.txt")))
//    println(Day15.part2(readLinesFromFile("day15.txt")))
//    println(Day16.part1(readLinesFromFile("day16.txt")))
//    println(Day16.part2(readLinesFromFile("day16.txt")))
//    println(Day17.part1(readLinesFromFile("day17.txt")))
//    println(Day17.part2(readLinesFromFile("day17.txt")))
//    println(Day18.part1(readLinesFromFile("day18.txt")))
//    println(Day18.part2(readLinesFromFile("day18.txt")))
//    println(Day19.part1(readLinesFromFile("day19.txt")))
//    println(Day19.part2(readLinesFromFile("day19.txt")))
//    println(Day20.part1(34000000))
//    println(Day20.part2(34000000))
//    println(Day21.part1(readLinesFromFile("day21.txt")))
//    println(Day21.part2(readLinesFromFile("day21.txt")))
//    println(Day22.part1(readLinesFromFile("day22.txt")))
//    println(Day22.part2(readLinesFromFile("day22.txt")))
//    println(Day23.part1(readLinesFromFile("day23.txt")))
//    println(Day23.part2(readLinesFromFile("day23.txt")))
//    println(Day24.part1(readLinesFromFile("day24.txt")))
//    println(Day24.part2(readLinesFromFile("day24.txt")))
    println(Day25.part1())
}

private fun readLinesFromFile(filename: String) = File("src//main//resources//v2015//$filename")
    .readLines()

private fun readText(filename: String) = File("src//main//resources//v2015//$filename")
    .readText(Charset.forName("UTF-8"))

private fun readAndSplitByEmptyLines(filename: String) = File("src//main//resources//v2015//$filename")
    .readText(Charset.forName("UTF-8"))
    .split("\n\n")
    .map { it.split("\n") }
