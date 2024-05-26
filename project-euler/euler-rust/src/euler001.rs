pub fn sum_multiples_of_3_and_5_bt(n: u64) -> u64 {
    let mut sum: u64 = 0;
    for i in 1..n {
        if i % 3 == 0 || i % 5 == 0 {
            sum += i;
        }
    }
    sum
}

pub fn sum_multiples_of_3_and_5_bt_fp(n: u64) -> u64 {
    let is_mod_3_or_5 = |v: &u64| v % 3 == 0 || v % 5 == 0;

    (1..n)
        .filter(is_mod_3_or_5)
        .sum()
}

// 55550    5 * 4 = 20
// 55500
// 55000
// 50000
//
fn sum_multiples_of_in(n: u64, value: u64) -> u64 {
    let t = (value - 1) / n;
    (((t + 1) * t) / 2) * n
}

pub fn sum_multiples_of_3_and_5_fast(n: u64) -> u64 {
    sum_multiples_of_in(3, n) + sum_multiples_of_in(5, n) - sum_multiples_of_in(15, n)
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn test_brute_force() {
        assert_eq!(sum_multiples_of_3_and_5_bt(10_000_000), 23333331666668);
        assert_eq!(sum_multiples_of_3_and_5_bt(10000), 23331668);
        assert_eq!(sum_multiples_of_3_and_5_bt(1000), 233168);
        assert_eq!(sum_multiples_of_3_and_5_bt(49), 543);
        assert_eq!(sum_multiples_of_3_and_5_bt(19564), 89301183);
        assert_eq!(sum_multiples_of_3_and_5_bt(8456), 16687353);
    }


    #[test]
    fn test_brute_force_fp() {
        assert_eq!(sum_multiples_of_3_and_5_bt_fp(10_000_000), 23333331666668);
        assert_eq!(sum_multiples_of_3_and_5_bt_fp(1000), 233168);
        assert_eq!(sum_multiples_of_3_and_5_bt_fp(49), 543);
        assert_eq!(sum_multiples_of_3_and_5_bt_fp(19564), 89301183);
        assert_eq!(sum_multiples_of_3_and_5_bt_fp(8456), 16687353);
    }

    #[test]
    fn test_fast() {
        assert_eq!(sum_multiples_of_3_and_5_fast(10), 23);
        assert_eq!(sum_multiples_of_3_and_5_fast(10_000_000), 23333331666668);
        assert_eq!(sum_multiples_of_3_and_5_fast(10000), 23331668);
        assert_eq!(sum_multiples_of_3_and_5_fast(1000), 233168);
        assert_eq!(sum_multiples_of_3_and_5_fast(49), 543);
        assert_eq!(sum_multiples_of_3_and_5_fast(19564), 89301183);
        assert_eq!(sum_multiples_of_3_and_5_fast(8456), 16687353);
    }
}
