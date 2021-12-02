fn multiples_of_3_and_5(n: i32) -> i32 {
    let mut sum = 0;
    for i in 1..n {
        if i % 3 == 0 || i % 5 == 0 {
            sum = sum + i;
        }
    }
    return sum;
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
}
