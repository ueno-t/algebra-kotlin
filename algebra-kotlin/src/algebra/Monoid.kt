package jp.scriptkidie.domain.algebra

/**
 * 単系（Monoid）
 * 集合 S とその上の二項演算 ・ が以下の条件を満たすならば、これを モノイド という
 * 
 * [結合性] 任意の a,b,c∈S に対し (a⋅b)⋅c=a⋅(b⋅c) が成り立つ
 * [単位元] ある e∈Sがあり、任意の a∈Sに対して a⋅e=e⋅a=a
 */
interface Monoid {

	/** 乗法群の演算（a * b） */
	operator fun times(other: Monoid): Monoid
	/** 単位元 */
	var identity: Monoid

}