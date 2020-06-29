import java.util.*

class ReconstructItinerary {
    fun findItinerary(tickets: List<List<String>>): List<String> {
        val ticketMap: HashMap<String, PriorityQueue<String>> = HashMap()
        var itinerary: List<String>
        var startPointIndex = 0

        for (ticketPair in tickets) {
            val queue = ticketMap.getOrDefault(ticketPair[0], PriorityQueue())
            queue.add(ticketPair[1])
            ticketMap[ticketPair[0]] = queue
        }

        do {
            itinerary = traverse(ticketMap, startPointIndex)
            startPointIndex++
        } while (itinerary.size != tickets.size + 1 || startPointIndex != ticketMap["JFK"]!!.size)

        return itinerary
    }

    private fun traverse(ticketMap: HashMap<String, PriorityQueue<String>>, startIndex: Int): List<String> {
        val itinerary: ArrayList<String> = ArrayList()
        itinerary.add("JFK")
        var target = ticketMap["JFK"]!!.elementAt(startIndex)

        while (ticketMap[target]!!.isNotEmpty()) {
            itinerary.add(target)
            target = ticketMap[target]!!.remove()
        }

        return itinerary
    }
}