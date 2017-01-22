package jp.scriptkidie.domain.algebra

/**
 * 加法群（AdditiveGroup）
 * 
 */
interface AdditiveGroup {
	/** 加法群の演算（a + b） */
	operator fun plus(other: AdditiveGroup): AdditiveGroup
	/** 逆元（-a） */
    operator fun unaryMinus(): AdditiveGroup
	/** 単位元（0） */
    var zero: AdditiveGroup

	// extension
	/** 加法群の演算（a - b） -> (a + (-b)) */
	operator fun <G: AdditiveGroup>minus(other: G): AdditiveGroup {
		return this + (-other)
	}

}