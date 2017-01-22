package jp.scriptkidie.domain.algebra

/** 
 * 群（Group）
 * 集合 G に演算 ⋅ があり、以下を満たすとき G を 群 (Group)という：
 * 
 * [結合性] 任意の a,b,c∈G に対し (a⋅b)⋅c=a⋅(b⋅c) が成り立つ
 * [単位元] ある e∈G があり、任意の a∈Gに対して a⋅e=e⋅a=a
 * [逆元] 任意の a∈G に対して、その逆元 a^-1∈Gがあり、a⋅a^-1=a^-1⋅a=e
 */
interface Group: Monoid {

	/** 逆元 */
	var inverse: Group

	// extension
	fun testAssociativity(a: Group, b: Group, c: Group): Boolean {
		return (a * b) * c == a * (b * c)
	}

	fun testIdentity(a: Group): Boolean {
		return (a * identity == a) && (identity * a == a)
	}

	fun testInverse(a: Group): Boolean {
		return (a * a.inverse == identity) && (a.inverse * a == identity)
	}
}