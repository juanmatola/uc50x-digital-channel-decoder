package main.encoder;

import java.util.Optional;

public class UCDigitalOutputs {

	private Optional<Boolean> do01Value;
	private Optional<Boolean> do02Value;

	public UCDigitalOutputs() {
		this.do01Value = Optional.empty();
		this.do02Value = Optional.empty();
	}

	public UCDigitalOutputs(Boolean do01Value, Boolean do02Value) {
		this.do01Value = Optional.ofNullable(do01Value);
		this.do02Value = Optional.ofNullable(do02Value);
	}

	public Optional<Boolean> getDo01Value() {
		return do01Value;
	}

	public void setDO01Value(Boolean do01Value) {
		this.do01Value = Optional.ofNullable(do01Value);
	}

	public Optional<Boolean> getDo02Value() {
		return do02Value;
	}

	public void setDO02Value(Boolean do02Value) {
		this.do02Value = Optional.ofNullable(do02Value);
	}

}
