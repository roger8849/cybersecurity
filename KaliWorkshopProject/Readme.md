# Kali Workshop hands on project.
Roger Ramírez Espejo.<br />
Software engineer, architect and enthusiast. <br />
Cybersecurity Project - Kali linux workshop
## Table of contents.


## Introduction.
This project shows the usage of several tools provided by [Kali linux](https://www.kali.org/), which help to evaluate the security of our technology appliances. In this workshop there were used the following versions of Kali Linux:

<kbd>![Kali versions](evidences/0.1_Kali_Versions.png)</kbd>

- [Bare Metal](https://www.kali.org/get-kali/#kali-bare-metal): Installable version which was intalled in an old laptop. This version was used to execute the Wifi cracking section.
- [Virtual Box - VM](https://www.kali.org/get-kali/#kali-virtual-machines): Virtual box version of the operative system. Used to execute the rest of the project except the Wifi cracking section.
- [Metasploitable - VM](): Vulnerable Server which will be during the workshop to show common vulnerabilities of the servers, displayed by the tools used here.

### Metasploitable download and startup

Metasploitable download page: https://sourceforge.net/projects/metasploitable/
<br />
<kbd>![Metasploitable download page](evidences/0.2_Metasploit_Download.png)</kbd>

<br />
<br />

Vulnerable server configuration on `192.168.50.91`:
<br />
<kbd>![Metasploitable startup](evidences/0.3_Metasploit_Startup.png)</kbd>

<br />

### Disclaimer
This Workshop and it's results were performed only for educational purposes. Any misusage of the information of this report is not responsibility of the author. Discresion is adviced.

Depending on the time of reading of this report some features might changed or replaced by diferent tools.

## Information Gathering.
This section shows the following tools:

- [Dmitry](https://tools.kali.org/information-gathering/dmitry): DMitry (Deepmagic Information Gathering Tool) is a UNIX/(GNU)Linux Command Line Application coded in C. DMitry has the ability to gather as much information as possible about a host. Base functionality is able to gather possible subdomains, email addresses, uptime information, tcp port scan, whois lookups, and more. 
- [DNSEnum](https://tools.kali.org/information-gathering/dnsenum): Multithreaded perl script to enumerate DNS information of a domain and to discover non-contiguous ip blocks.
- [Nmap](https://nmap.org/): Mapping appliance which display the details of the devices connected to the current network.

These tools are located under information gathering section in start menu in kali linux:

<kbd>![InformationGatherin](evidences/1.0_InformationGatherinToolsKali.png)</kbd>
<br />
<br />

### Deepmagic for reconnaissance
The objective of this section is to explore the server information of sites such as [Rappi.com](https://rappi.com) and [Yahoo.com](https://yahoo.com) in order to reconnaisse their DNS information:

Command below will help to gather as much information as possible about the host [Rappi.com](https://rappi.com)
```
dmtry rappi.com
```
Domain name information:
```
  Domain Name: RAPPI.COM
   Registry Domain ID: 87997065_DOMAIN_COM-VRSN
   Registrar WHOIS Server: whois.godaddy.com
   Registrar URL: http://www.godaddy.com
   Updated Date: 2021-01-19T21:04:12Z
   Creation Date: 2002-06-30T06:54:15Z
   Registry Expiry Date: 2026-06-30T06:59:38Z
   Registrar: GoDaddy.com, LLC
   Registrar IANA ID: 146
   Registrar Abuse Contact Email: abuse@godaddy.com
   Registrar Abuse Contact Phone: 480-624-2505
   Domain Status: clientDeleteProhibited https://icann.org/epp#clientDeleteProhibited
   Domain Status: clientRenewProhibited https://icann.org/epp#clientRenewProhibited
   Domain Status: clientTransferProhibited https://icann.org/epp#clientTransferProhibited
   Domain Status: clientUpdateProhibited https://icann.org/epp#clientUpdateProhibited
   Name Server: NS-1018.AWSDNS-63.NET
   Name Server: NS-1254.AWSDNS-28.ORG
   Name Server: NS-1908.AWSDNS-46.CO.UK
   Name Server: NS-62.AWSDNS-07.COM
   DNSSEC: unsigned
   URL of the ICANN Whois Inaccuracy Complaint Form: https://www.icann.org/wicf/
>>> Last update of whois database: 2021-06-28T17:02:18Z <<<

For more information on Whois status codes, please visit https://icann.org/epp
```
Found subdomains of [Rappi.com](https://rappi.com)
```
Searching Google.com:80...
HostName:www.rappi.com
HostIP:13.227.26.87
HostName:aliados.rappi.com
HostIP:13.227.26.21
HostName:partners.rappi.com
HostIP:13.227.26.21
HostName:mitienda.rappi.com
HostIP:13.227.26.117
HostName:blog.rappi.com
HostIP:35.165.115.229
HostName:promos.rappi.com
HostIP:198.185.159.144
HostName:brands.rappi.com
HostIP:13.227.26.119
HostName:legal.rappi.com
HostIP:44.230.206.229
HostName:www.restaurantes.rappi.com
HostIP:3.229.159.122
HostName:ads.rappi.com
HostIP:13.227.26.8
HostName:lives.rappi.com
HostIP:13.227.26.88
HostName:lupe.rappi.com
HostIP:13.227.26.38
HostName:travel4business.rappi.com
HostIP:13.227.26.68
HostName:cms-growth.rappi.com
HostIP:13.227.26.78
HostName:retail-cms.rappi.com
HostIP:13.227.26.95
HostName:erp-shoppers.rappi.com
HostIP:13.227.26.62
HostName:viajes.rappi.com
HostIP:13.227.26.91
HostName:help.partners.rappi.com
HostIP:13.227.26.5                                                             
HostName:rappipay.rappi.com                                                     
HostIP:13.227.26.102                                                                
HostName:microservices.dev.rappi.com                                                      
HostIP:13.227.26.56                                                                            
HostName:dev-portal.rappi.com                                                                          
HostIP:13.227.26.122                                                                                   
HostName:images.rappi.com                                                                                    
HostIP:13.227.26.111                                                                                         
Searching Altavista.com:80...                                                                                     
Found 22 possible subdomain(s) for host rappi.com, Searched 0 pages containing 0 results
```

Dmitry also displays information about emails, however no email information was found for the host  [Rappi.com](https://rappi.com). However the same command `dmitry` was executed over [Yahoo.com](https://yahoo.com), `dmitry yahoo.com` returning the following email results:

```
Gathered E-Mail information for yahoo.com
---------------------------------
Searching Google.com:80...
yourname@yahoo.com
stlb@yahoo.com
alguien@yahoo.com
sbwoodside@yahoo.com
mphciencia@yahoo.com
dges@yahoo.com
noelbadges@yahoo.com
30002000@yahoo.com
rubieraj@yahoo.com
susanaesposito29@yahoo.com
rpedace3990@yahoo.com
sendyourpictures@yahoo.com
hai@yahoo.com
rifervia@yahoo.com
aimee.steppingstones@yahoo.com
urusjavier@yahoo.com
delagarzaopina@yahoo.com
rasaucedob@yahoo.com
jonesgd68@yahoo.com
base1@yahoo.com
farmaluiscordero@yahoo.com
edwale1981@yahoo.com
darylmwalker@yahoo.com
gcoladonato@yahoo.com
titovmv@yahoo.com
solyanik2002@yahoo.com
husainfive@yahoo.com
kristoffersonkris@yahoo.com
dbnellis@yahoo.com
juliedlynch@yahoo.com
kfzhouy@yahoo.com
ono00@yahoo.com
grassfairy@yahoo.com
lilianamaya60@yahoo.com
privacy@es.yahoo.com
leroymunsey@yahoo.com
mendofrank@yahoo.com
sa@yahoo.com
stopgapnow@yahoo.com
fan02@yahoo.com
mtdew77@yahoo.com
siqueiros74@yahoo.com
figo2472000@yahoo.com
hendrixson@yahoo.com
sohailshafii@yahoo.com
Voyager1063@yahoo.com
jzarra@yahoo.com
lee123@yahoo.com
rpinecorfu@yahoo.com
pkchatterjee5@yahoo.com
alejococinero@yahoo.com
james.nalley@yahoo.com
kidsfirstdhfcc@yahoo.com
ange@yahoo.com
lindsaycwright@yahoo.com
millerjon34@yahoo.com
zhong@yahoo.com
jl5909@yahoo.com
20JoSmiles@yahoo.com
JoSmiles@yahoo.com
jbprolrm@yahoo.com
amber@yahoo.com
beach5sandsoccer@yahoo.com
trishwoolbright@yahoo.com
normaosti@yahoo.com
billybob@yahoo.com
sbgogia1955@yahoo.com
liz.murnin@yahoo.com
ximenadebaquero@yahoo.com
marceloaustria@yahoo.com
citotia@yahoo.com
```

Adding the options `pb` to our vulnerable server `192.168.50.91` will perform a tcp port scan on a host and read in the banner received from it:
```
$ dmitry -pb 192.168.50.91 
Deepmagic Information Gathering Tool
"There be some deep magic going on"

HostIP:192.168.50.91
HostName:192.168.50.91

Gathered TCP Port information for 192.168.50.91
---------------------------------

 Port           State

21/tcp          open
>> 220 (vsFTPd 2.3.4)

22/tcp          open
>> SSH-2.0-OpenSSH_4.7p1 Debian-8ubuntu1

23/tcp          open
>> ��▒�� ��#��'
25/tcp          open
>> 220 metasploitable.localdomain ESMTP Postfix (Ubuntu)

53/tcp          open
zsh: segmentation fault  dmitry -pb 192.168.50.91
```
<br />
<br />

### DNS Enum for passive recognaisse
DNS enum allows to enumerate all the DNS information for the domain [Rappi.com](https://rappi.com) to detect it's ip blocks. This information is retrieved by the attacker to recognaisse the network information of it's domain.

```
$ dnsenum rappi.com                                                                                                                                                                                                                  130 ⨯
dnsenum VERSION:1.2.6

-----   rappi.com   -----                                                                                                                                                                                                                         
Host's addresses:                                                                                                                                                                                                                            
__________________                                                                                                                                                                                                      
rappi.com.                               59       IN    A        13.227.26.106                                                                                                                                                               
rappi.com.                               59       IN    A        13.227.26.85
rappi.com.                               59       IN    A        13.227.26.87
rappi.com.                               59       IN    A        13.227.26.65

Name Servers:                                                                                                                                                                                                                ______________                                                                                                                                                                                                                               
                                                                                                                                                                                                                                             
ns-1908.awsdns-46.co.uk.                 21599    IN    A        205.251.199.116                                                                                                                                                             
ns-62.awsdns-07.com.                     21599    IN    A        205.251.192.62
ns-1254.awsdns-28.org.                   20168    IN    A        205.251.196.230
ns-1018.awsdns-63.net.                   19939    IN    A        205.251.195.250

                                                                                                                                                                                                                                             
Mail (MX) Servers:                                                                                                                                                                                                                           
___________________                                                                                                                                                                                                                          
                                                                                                                                                                                                                                             
aspmx.l.google.com.                      292      IN    A        172.217.193.27                                                                                                                                                              
alt3.aspmx.l.google.com.                 292      IN    A        142.250.153.27
alt4.aspmx.l.google.com.                 292      IN    A        142.251.9.27
alt1.aspmx.l.google.com.                 292      IN    A        209.85.202.27
alt2.aspmx.l.google.com.                 292      IN    A        64.233.184.27

                                                                                                                                                                                                                                             
Trying Zone Transfers and getting Bind Versions:                                                                                                                                                                                             
_________________________________________________                                                                                                                                                                                                                                                                                                                                                              
Trying Zone Transfer for rappi.com on ns-1908.awsdns-46.co.uk ... 
AXFR record query failed: corrupt packet

Trying Zone Transfer for rappi.com on ns-62.awsdns-07.com ... 
AXFR record query failed: corrupt packet

Trying Zone Transfer for rappi.com on ns-1254.awsdns-28.org ... 
AXFR record query failed: corrupt packet

Trying Zone Transfer for rappi.com on ns-1018.awsdns-63.net ... 
AXFR record query failed: corrupt packet
                                                                                                                                                                                                                           
Brute forcing with /usr/share/dnsenum/dns.txt:                                                                                                                                                                                               
_______________________________________________                                                                                                                                                                                              
                                                                                                                                                                                                                                             
ads.rappi.com.                           299      IN    CNAME    duvs4i36c8yj8.cloudfront.net.                                                                                                                                               
duvs4i36c8yj8.cloudfront.net.            59       IN    A        13.227.26.108
duvs4i36c8yj8.cloudfront.net.            59       IN    A        13.227.26.38
duvs4i36c8yj8.cloudfront.net.            59       IN    A        13.227.26.8
duvs4i36c8yj8.cloudfront.net.            59       IN    A        13.227.26.86
blog.rappi.com.                          59       IN    A        35.165.115.229
blog.rappi.com.                          59       IN    A        35.163.107.0
br.rappi.com.                            3599     IN    CNAME    soyrappi.com.
soyrappi.com.                            59       IN    A        13.227.26.40
soyrappi.com.                            59       IN    A        13.227.26.66
soyrappi.com.                            59       IN    A        13.227.26.96
soyrappi.com.                            59       IN    A        13.227.26.107
jobs.rappi.com.                          299      IN    CNAME             (
rappi-jobs-global-242617298.us-west-2.elb.amazonaws.com. 59       IN    A                 (
rappi-jobs-global-242617298.us-west-2.elb.amazonaws.com. 59       IN    A                 (
rappi-jobs-global-242617298.us-west-2.elb.amazonaws.com. 59       IN    A                 (
mail.rappi.com.                          299      IN    CNAME    u1778784.wl035.sendgrid.net.
mx.rappi.com.                            299      IN    CNAME    cms.mxgrability.rappi.com.
syslog.rappi.com.                        59       IN    A        172.27.18.127
syslog.rappi.com.                        59       IN    A        172.27.11.166
syslog.rappi.com.                        59       IN    A        172.27.12.199
vpn.rappi.com.                           299      IN    A        54.69.200.23
www.rappi.com.                           48       IN    CNAME    d3k3efoimgx9br.cloudfront.net.
d3k3efoimgx9br.cloudfront.net.           59       IN    A        13.227.26.87
d3k3efoimgx9br.cloudfront.net.           59       IN    A        13.227.26.65
d3k3efoimgx9br.cloudfront.net.           59       IN    A        13.227.26.106
d3k3efoimgx9br.cloudfront.net.           59       IN    A        13.227.26.85

                                                                                                                                                                                                                                             
rappi.com class C netranges:                                                                                                                                                                                                                 
_____________________________                                                                                                                                                                                           
 13.227.26.0/24                                                                                                                                                                                                                              
 35.163.107.0/24
 35.165.115.0/24
 54.69.200.0/24

                                                                                                                                                                                                                                             
Performing reverse lookup on 1024 ip addresses:                                                                                                                                                                                              
________________________________________________                                                                                                                                                                        
0 results out of 1024 IP addresses.

                                                                                                                                                                                                                                             
rappi.com ip blocks:                                                                                                                                                                                                                         
_____________________                                                                                                                                                                                                          
done.

```
<br />
<br />

### Nmap for active Recoginaisse of the servers.

`Nmap` is one of the most important tools in order to retrieve information of the network. Basically scans the devices connected to the current network and it can show the open TCP and UDP ports, in order to provide to the attacker the recognizment of the possible vulnerabilities in the network that can be exploit.

`Nmap` over the network segment `192.168.50.0/24` displays the current elements on my local network:

```
$ sudo nmap -sn 192.168.50.0/24

Starting Nmap 7.91 ( https://nmap.org ) at 2021-06-28 20:07 EDT
Nmap scan report for RT-AX86U-D900 (192.168.50.1)
Host is up (0.0032s latency).
MAC Address: 24:4B:FE:2F:D9:00 (Asustek Computer)
Nmap scan report for HPA9AC82 (192.168.50.38)
Host is up (0.12s latency).
MAC Address: D0:BF:9C:A9:AC:82 (Hewlett Packard)
Nmap scan report for 192.168.50.91 (192.168.50.91) ------------------------------------> Metasploitable server
Host is up (0.0023s latency).
MAC Address: 08:00:27:E7:85:4F (Oracle VirtualBox virtual NIC)
Nmap scan report for 192.168.50.117 (192.168.50.117)
Host is up (0.100s latency).
MAC Address: 48:43:DD:DE:FC:70 (Amazon Technologies)
Nmap scan report for C02CH3VAMD6N (192.168.50.165)
Host is up (0.066s latency).
MAC Address: 3C:22:FB:0C:70:B1 (Apple)
Nmap scan report for LAPTOP-TP93I1KD (192.168.50.177)
Host is up (0.0022s latency).
MAC Address: D0:37:45:B2:6E:81 (Tp-link Technologies)
Nmap scan report for android-1ae455ba040832c6 (192.168.50.179)
Host is up (0.058s latency).
MAC Address: 10:4F:A8:44:99:70 (Sony)
Nmap scan report for Chromecast (192.168.50.240)
Host is up (0.13s latency).
MAC Address: F0:5C:77:32:37:07 (Google)
Nmap scan report for kali (192.168.50.251)
Host is up.
Nmap done: 256 IP addresses (9 hosts up) scanned in 2.37 seconds
```