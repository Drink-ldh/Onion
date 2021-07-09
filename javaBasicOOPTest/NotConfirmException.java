package javaBasicOOPTest;

public class NotConfirmException extends Exception {
	@Override
	public String toString() {
		return "본인이 아닙니다. 담임 혹은 본인만 확인할 수 있습니다.";
	}
}
