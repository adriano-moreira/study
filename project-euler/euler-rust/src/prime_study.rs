fn is_prime(n: u64) -> bool {
    if n < 2 {
        return false;
    }
    for x in 2..n {
        if n % x == 0 {
            return false;
        }
    }
    return true;
}

fn next_prime(n: u64) -> u64 {
    let mut i = n;
    'outer: loop {
        i += 1;
        for x in 2..i {
            if i % x == 0 {
                continue 'outer;
            }
        }
        return i;
    }
}

fn main() {
    // for n in 0..100 {
    //     if is_prime(n) {
    //         // println!("n: {:?} is prime", n);
    //         print!("{:?},", n);
    //     } else {
    //         // println!(".");
    //     }
    // }

    // let mut n = 2;
    // while n < 1_00000 {
    //     n = next_prime(n);
    //     println!("{}", n);
    // }

    // println!("{}", next_prime(100_000_000_000));
    println!("{}", next_prime(200_000_000));
}