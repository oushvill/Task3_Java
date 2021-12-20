public class IncludeStringFilter implements Filter {
    private String pattern;

    public IncludeStringFilter(String pattern) {
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
        return str.contains(pattern);
    }
}
