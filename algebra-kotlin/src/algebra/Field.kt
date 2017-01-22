package jp.scriptkidie.domain.algebra

/**
 * 体（Field）
 * 集合 F が二つの演算 +,⋅ に関して 環 を成し、 F−{0} が ⋅ に関して 群 を成すとき、F を 体 (Field) という。
 */
interface Field: Group, Ring {
	// extension
	operator fun <F: Field>div(other: F): Monoid {
		return this * other.inverse
	}
}