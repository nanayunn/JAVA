function submit () {
	fetch('/submit', {
		method: 'POST',
		headers: {'Content-Type': 'application/json'},
		body: JSON.stringify({'answers': })
	})
		.then(res => res.json())
		.then(ret => {
			if(ret){
				console.log("정답")
			}else{
				console.log("오답
			}
		});
};
