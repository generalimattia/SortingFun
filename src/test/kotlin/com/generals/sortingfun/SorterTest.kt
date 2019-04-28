package com.generals.sortingfun

import org.junit.Assert.assertEquals
import org.junit.Test

class SorterTest {

    @Test
    fun shouldSortWithSelection() {
        val input: MutableList<Char> = "SORTEXAMPLE".toMutableList()

        val sut: Sorter<Char> = SelectionSort(input)

        val output: List<Char> = sut.sort()

        assertEquals(11, output.size)
        assertEquals("AEELMOPRSTX".toList(), output)
    }

    @Test
    fun shouldSortWithInsertion() {
        val input: MutableList<Char> = "SORTEXAMPLE".toMutableList()

        val sut: Sorter<Char> = InsertionSort(input)
        val output: List<Char> = sut.sort()

        assertEquals(11, output.size)
        assertEquals("AEELMOPRSTX".toList(), output)
    }
}