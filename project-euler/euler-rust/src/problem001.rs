fn multiples_of_3_and_5(n: i32) -> i32 {
    let mut sum = 0;
    for i in 1..n {
        if i % 3 == 0 || i % 5 == 0 {
            sum = sum + i;
        }
    }
    return sum;
}

fn multiples_of_3_and_5_fp(n: i32) -> i32 {
    let is_mod_3_or_5 = |v: &i32| v % 3 == 0 || v % 5 == 0;

    (1..n)
        .filter(is_mod_3_or_5)
        .sum()
}

#[cfg(test)]
mod test {
    use super::*;

    #[test]
    fn test() {
        assert_eq!(multiples_of_3_and_5(1000), 233168);
        assert_eq!(multiples_of_3_and_5(49), 543);
        assert_eq!(multiples_of_3_and_5(19564), 89301183);
        assert_eq!(multiples_of_3_and_5(8456), 16687353);
    }

    #[test]
    fn test_fp() {
        assert_eq!(multiples_of_3_and_5_fp(1000), 233168);
        assert_eq!(multiples_of_3_and_5_fp(49), 543);
        assert_eq!(multiples_of_3_and_5_fp(19564), 89301183);
        assert_eq!(multiples_of_3_and_5_fp(8456), 16687353);
    }
}
