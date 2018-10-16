# kotlin<br/>
Android Studio

Resolvendo esse erro -> KVM is required to run this AVD. /dev/kvm device: permission denied. Grant current user access to /dev/kvm <br/>
sudo apt install qemu-kvm<br/>
sudo adduser <Replace with username> kvm<br/>
sudo chown <Replace with username> /dev/kvm<br/>
