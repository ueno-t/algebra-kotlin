package jp.scriptkidie.domain.algebra

class R(val value: Double):Field {

	override fun times(other: Monoid): R = this * other
	override fun plus(other: AdditiveGroup): R = this + other
    override fun unaryMinus(): R = -this

	override var identity: Monoid = R(1.0)
	override var inverse: Group = R(-1.0)
	override var zero: AdditiveGroup = R(0.0)
}