package sth.app.common;

/** Messages for menu interactions. */
@SuppressWarnings("nls")
public interface Message {

  /**
   * @return prompt for discipline name
   */
  public static String requestDisciplineName() {
    return "Nome da disciplina: ";
  }

  /**
   * @return prompt for project name
   */
  public static String requestProjectName() {
    return "Nome do projecto: ";
  }
}
