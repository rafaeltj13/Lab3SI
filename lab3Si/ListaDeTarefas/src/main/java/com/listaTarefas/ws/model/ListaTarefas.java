package com.listaTarefas.ws.model;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	private String description = "";
	private List<Tarefa> tasks = new ArrayList<>();
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Tarefa> getTasks() {
		return tasks;
	}
	public void setTasks(List<Tarefa> tasks) {
		this.tasks = tasks;
	}
	
}
