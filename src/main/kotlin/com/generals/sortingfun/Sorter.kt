package com.generals.sortingfun

interface Sorter<T : Comparable<T>> {

    fun sort(): List<T>
}

/**
 * SELECTION SORT
 *
 * First, find the smallest item in the list and exchange it with the first entry.
 * Then, find the next smallest item and exchange it with the second entry. Continue in this way
 * until the entire array is sorted. It works by repeatedly selecting the smallest remaining item.
 */
class SelectionSort<T : Comparable<T>>(
    private val data: MutableList<T>
) : Sorter<T> {

    override fun sort(): List<T> {

        data.forEachIndexed { index: Int, current: T ->
            var min: Int = index

            (index until data.size).forEach { j ->
                if (data[j] < data[min]) {
                    min = j
                }
            }

            data[index] = data[min]
            data[min] = current
        }

        return data
    }
}

/**
 * INSERTION SORT
 *
 * It considers one item at time, inserting each into its proper place among those already
 * considered (keeping them sorted). As in selection sort, the items to the left of the current
 * index are in sorted order during the sort, but they are not in their final position.
 */
class InsertionSort<T : Comparable<T>>(
    private val data: MutableList<T>
) : Sorter<T> {

    override fun sort(): List<T> {

        data.forEachIndexed { index: Int, _: T ->

            (index downTo 1).forEach { j: Int ->

                if (data[j] < data[j - 1]) {
                    val current: T = data[j]
                    data[j] = data[j - 1]
                    data[j - 1] = current
                }
            }
        }

        return data
    }
}