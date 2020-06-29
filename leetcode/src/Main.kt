fun main() {
    val ltinerary: List<String> = ReconstructItinerary().findItinerary(
        mutableListOf(
            mutableListOf("MUC", "LHR"),
            mutableListOf("JFK", "MUC"),
            mutableListOf("SFO", "SJC"),
            mutableListOf("LHR", "SFO")
        )
    )
    print(ltinerary)
}
