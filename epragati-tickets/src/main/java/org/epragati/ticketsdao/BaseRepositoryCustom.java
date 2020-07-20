package org.epragati.ticketsdao;

import java.io.Serializable;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

@NoRepositoryBean
public interface BaseRepositoryCustom<T, ID extends Serializable>
		extends PagingAndSortingRepository<T, Serializable>, QueryByExampleExecutor<T> {

	@Override default <S extends T> Iterable<S> save(Iterable<S> entities) { 
		//TODO Auto-generated method stub 
		return null; }

	@Override
	default T findOne(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default boolean exists(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default Iterable<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Iterable<T> findAll(Iterable<Serializable> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	default void delete(Serializable id) {
		// TODO Auto-generated method stub

	}

	@Override
	default void delete(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	default void delete(Iterable<? extends T> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	default void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	default <S extends T> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends T> Iterable<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends T> Iterable<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends T> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	default <S extends T> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default Iterable<T> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Page<T> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	/* <S extends T> S insert(S entity); */
	

}
