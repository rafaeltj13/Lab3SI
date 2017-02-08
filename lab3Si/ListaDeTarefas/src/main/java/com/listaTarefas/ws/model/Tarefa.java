package com.listaTarefas.ws.model;

import java.util.ArrayList;

public class Tarefa {
	
	private String taskDescription = "";
	private ArrayList<SubTarefa> subTasks = new ArrayList<>();
	private boolean completed;
	private int priority;
	private int idTaskList;
	
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getIdTaskList() {
		return idTaskList;
	}
	public void setIdTaskList(int idTaskList) {
		this.idTaskList = idTaskList;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public ArrayList<SubTarefa> getSubTasks() {
		return subTasks;
	}
	public void setSubTasks(ArrayList<SubTarefa> subTasks) {
		this.subTasks = subTasks;
	}
	
	
}
