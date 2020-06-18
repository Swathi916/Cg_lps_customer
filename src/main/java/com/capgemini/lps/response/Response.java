package com.capgemini.lps.response;

import lombok.Data;

@Data
public class Response<T> {

		private boolean error;

		private String message;

		T data;

		public Response() {
		}
		
		public Response(boolean error,String message,T data) {
			this.error = error;
			this.message = message;
			this.data = data;
		}
	}


