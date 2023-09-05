# comandi sh da eseguire per creare il mio ambiente scala
sudo apt install openjdk-11-jdk git curl wget unzip -y
curl -fL "https://github.com/coursier/launchers/raw/master/cs-x86_64-pc-linux.gz" | gzip -d > cs
chmod +x cs
./cs setup
JAVA_HOME=`cs java-home`