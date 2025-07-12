class Solution {
    static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        return modSuperPow(a % MOD, b, b.length - 1);
    }

    private int modSuperPow(int a, int[] b, int index) {
        if (index < 0) return 1;

        int last = b[index];

        int part1 = modPow(a, last);  
        int part2 = modPow(modSuperPow(a, b, index - 1), 10);  

        return (part1 * part2) % MOD;
    }

    
    private int modPow(int base, int exp) {
        int result = 1;
        base %= MOD;

        while (exp > 0) {
            if (exp % 2 == 1)
                result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp /= 2;
        }

        return result;
    }
}
