public class BeginStringFilter implements Filter {
    private String pattern;

    public BeginStringFilter(String pattern) {
        if (pattern != null) {
            this.pattern = pattern;
        } else {
            throw new IllegalArgumentException("Проверяемое слово пусто!");
        }
    }
    public String getPattern() {
        return pattern;
    }
    @Override
    public Boolean apply(String str) {
        return str.startsWith(pattern);
    }
}
