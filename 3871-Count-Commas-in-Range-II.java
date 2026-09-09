class Solution {
    public long countCommas(long n) {

        long dig4 = Math.max(0L, Math.min(n, 999999L) - 999L);

        long dig7 = Math.max(0L, Math.min(n, 999999999L) - 999999L) * 2;

        long dig10 = Math.max(0L, Math.min(n, 999999999999L) - 999999999L) * 3;

        long dig13 = Math.max(0L, Math.min(n, 999999999999999L) - 999999999999L) * 4;

        long dig16 = Math.max(0L, Math.min(n, 999999999999999999L) - 999999999999999L) * 5;

        return dig4 + dig7 + dig10 + dig13 + dig16;
    }
}