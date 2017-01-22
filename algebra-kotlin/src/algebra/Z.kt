package jp.scriptkidie.domain.algebra

class Z(val value: Int): Ring {
    // alias
    override operator fun times(other: Monoid): Z = this * other
    override operator fun plus(other: AdditiveGroup): Z = this + other  
    override operator fun unaryMinus(): Z = -this
    // extension
    override var identity: Monoid = Z(1)
    override var zero: AdditiveGroup = Z(0)
}