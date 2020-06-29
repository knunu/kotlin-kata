class PowerOfTwo {
    fun isPowerOfTwo(n: Int) : Boolean {
        var standard: Long = 1
        while (n > standard) {
            standard = standard.shl(1)
        }
        return standard.toInt() == n
    }
}
