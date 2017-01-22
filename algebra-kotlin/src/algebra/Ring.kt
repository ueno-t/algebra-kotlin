package jp.scriptkidie.domain.algebra

/**
 * 環（Ring）
 * 集合 R に二つの演算 +,⋅ があり、以下を満たすとき R を 環 (Ring) という：
 *
 * - R は+ に関して可換群である.
 *  - + に関する単位元を 0,
 *  - + に関する a の逆元を −a と書く.
 * - R は ⋅ に関してモノイドである.
 *  - ⋅ に関する単位元を 1 と書く.
 * [分配性] 任意の a,b,c∈Rに対して以下が成り立つ：
 *  - (a+b)⋅c=a⋅c+b⋅c
 *  - a⋅(b+c)=a⋅b+a⋅c
 */
interface Ring: AdditiveGroup, Monoid {}