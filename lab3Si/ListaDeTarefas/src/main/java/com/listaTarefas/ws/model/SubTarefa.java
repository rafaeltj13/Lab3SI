package com.listaTarefas.ws.model;

public class SubTarefa {
	
	private String subTaskDescription = "";
	private int idTask;
	private int idTaskList;
	
	public String getSubTaskDescription() {
		return subTaskDescription;
	}
	public void setSubTaskDescription(String subTaskDescription) {
		this.subTaskDescription = subTaskDescription;
	}
	public int getIdTask() {
		return idTask;
	}
	public void setIdTask(int idTask) {
		this.idTask = idTask;
	}
	public int getIdTaskList() {
		return idTaskList;
	}
	public void setIdTaskList(int idTaskList) {
		this.idTaskList = idTaskList;
	}

	

}
