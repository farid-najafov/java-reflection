package annotations.examples.fruits.entity;

@Rape(owner = "Dima", val = 90)
public class Apple implements Nameable {
  @Override
  public String name() {
    return "I'm Apple";
  }
}
