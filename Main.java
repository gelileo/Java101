class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  int fibonacci(int i) {
  if (i < 1) {
    return 0;
  } else if (i == 2) {
    return 2;
  } else if (i == 3) {
    return 3;
  } else {
  return fibonacci(i-1) + fibonacci(i-2)
  }

}
}

