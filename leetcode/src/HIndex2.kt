import kotlin.math.max
import kotlin.math.min

class HIndex2 {
    fun hIndex(citations: IntArray): Int {
        var hIndex = 0
        var start = 0
        var end = citations.lastIndex

        while (start <= end) {
            val median = (start + end) / 2
            val hCount = citations.size - median

            if (citations[median] <= hCount) {
                hIndex = max(hIndex, citations[median])
                start = median + 1
            } else {
                val min = min(hCount, citations[median])
                hIndex = max(hIndex, min)
                end = median - 1
            }
        }

        return hIndex
    }
}