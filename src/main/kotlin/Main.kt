fun main() {
  val sumPurchase = 4850.0
    val vip = true
    val bigDiscount = sumPurchase * 0.05
    val calcDiscont = if (sumPurchase <= 1000) 0.0 else if (sumPurchase > 1001 && sumPurchase < 10_000) 100.0 else bigDiscount
    val calcVip = if (vip) 0.99 else 1.0
    val finalSum = (sumPurchase - calcDiscont) * calcVip

    println("С учётом скидки сумма вашей покупки составит $finalSum")
}