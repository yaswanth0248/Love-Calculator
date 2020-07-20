package org.epragati.tickets.utills;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public abstract class TicketBaseMapper<V,E> {
	
	public abstract V convertEntity(E dto);
	public abstract E convertVO(V vo);
	
	public List<V> convertEntity(List<E> dtos) {

		return dtos.stream().map(e -> convertEntity(e)).collect(Collectors.toList());
	}
	
	public List<E> convertVO(List<V> vos) {

		return vos.stream().map(v -> convertVO(v)).collect(Collectors.toList());
	}
	
	public <T> void funPoint(T value, Consumer<T> consumer) {
		if (value != null) {
			consumer.accept(value);
		}
	}
	

}
