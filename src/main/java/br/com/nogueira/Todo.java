package br.com.nogueira;

public record Todo(
        Long userId,
        Long id,
        String title,
        Boolean completed
) {
}
