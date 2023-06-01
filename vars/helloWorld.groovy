def call (){
	echo "< WELCOME TO A-DEVOPS > !!!"
	  stage("Checkout Code") {
               steps {
                   git branch: 'main',
                       url: "https://github.com/Rohit-Nakhate/shared-LIB.git"
               }
           }
}
