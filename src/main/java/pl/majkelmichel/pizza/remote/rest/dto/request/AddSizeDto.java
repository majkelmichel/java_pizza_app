package pl.majkelmichel.pizza.remote.rest.dto.request;

import pl.majkelmichel.pizza.remote.rest.dto.response.SizeDto;

public class AddSizeDto {
    private SizeDto size;

    public AddSizeDto() {
    }

    public AddSizeDto(SizeDto size) {
        this.size = size;
    }

    public SizeDto getSize() {
        return size;
    }

    public void setSize(SizeDto size) {
        this.size = size;
    }
}
