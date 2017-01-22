package jp.scriptkidie.domain.algebra

class Q(val p: Z, val q:Z): Field {
	init { if (q.value == 0) error("denom: 0") }
	constructor(p: Z): this(p, Z(1))

	fun equals(other: Q): Boolean = this.p * other.q == this.q * other.p
    override operator fun times(other: Monoid): Q {
		other as Q
		return Q(this.p * other.p, this.q * other.q)
    }
    override operator fun plus(other: AdditiveGroup): Q {
		other as Q
    	return Q(this.p * other.q + this.q * other.p, // 分子
    			 this.q * other.q)                    // 分母
    } 
    override operator fun unaryMinus(): Q = Q(-this.p, this.q)
    // extension
    override var inverse: Group = Q(p, q)
    override var identity: Monoid = Z(1)
    override var zero: AdditiveGroup = Z(0)
}