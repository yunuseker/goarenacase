// Generated by Dagger (https://google.github.io/dagger).
package com.kgteknoloji.goarenacase.usecase;

import com.kgteknoloji.goarenacase.data.repository.TodoRepository;
import com.kgteknoloji.goarenacase.util.DateFormatter;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TodoUsecase_Factory implements Factory<TodoUsecase> {
  private final Provider<TodoRepository> todoRepositoryProvider;

  private final Provider<DateFormatter> dateFormatterProvider;

  public TodoUsecase_Factory(
      Provider<TodoRepository> todoRepositoryProvider,
      Provider<DateFormatter> dateFormatterProvider) {
    this.todoRepositoryProvider = todoRepositoryProvider;
    this.dateFormatterProvider = dateFormatterProvider;
  }

  @Override
  public TodoUsecase get() {
    return provideInstance(todoRepositoryProvider, dateFormatterProvider);
  }

  public static TodoUsecase provideInstance(
      Provider<TodoRepository> todoRepositoryProvider,
      Provider<DateFormatter> dateFormatterProvider) {
    return new TodoUsecase(todoRepositoryProvider.get(), dateFormatterProvider.get());
  }

  public static TodoUsecase_Factory create(
      Provider<TodoRepository> todoRepositoryProvider,
      Provider<DateFormatter> dateFormatterProvider) {
    return new TodoUsecase_Factory(todoRepositoryProvider, dateFormatterProvider);
  }

  public static TodoUsecase newTodoUsecase(
      TodoRepository todoRepository, DateFormatter dateFormatter) {
    return new TodoUsecase(todoRepository, dateFormatter);
  }
}
