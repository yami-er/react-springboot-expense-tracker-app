package com.example.codeengine.expense.model;

import javax.persistence.CascadeType;

public @interface manyToOne {

	CascadeType cascade();

}
