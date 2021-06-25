package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    /*
    *  return discount amount
    * */
    int discount(Member member, int price);
}
