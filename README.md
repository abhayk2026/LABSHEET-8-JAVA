# MCA203P Java Lab Sheet 08 — Complete Solutions

Contains solutions for **20 questions** from the provided OOP Using Java assignment.

## Requirements

- JDK 8 or later (JDK 11/17/21 recommended)
- VS Code or Windows CMD / PowerShell / Linux Terminal
- No external dependencies

## Compile and run

In Windows CMD, open this extracted folder and run:

```bat
cd src
javac *.java
java StudentBean
```

Or use `compile_all.bat` from the extracted root on Windows. On Linux/macOS, use `bash compile_all.sh`.

## Files / question mapping

- Q01: `StudentBean`
- Q02: `RectangleBean`
- Q03: `EmployeeBean`
- Q04: `DateBean`
- Q05: `UserBean`
- Q06: `AccountBean`
- Q07: `Q07_AccountChangeDemo`
- Q08: `Q08_StudentIntrospector`
- Q09: `CarBean`
- Q10: `CircleBean`
- Q11: `Q11_HostInfo`
- Q12: `HelloServer`
- Q13: `HelloClient`
- Q14: `HelloServer (same server with message reading)`
- Q15: `EchoServer`
- Q16: `MessageSender`
- Q17: `MessageReceiver`
- Q18: `WebReader`
- Q19: `FileDownloader`
- Q20: `MultiClientServer`


## Networking exercise order

Run the server in one terminal, then its client in another (within `src`):

- Q12, Q13, Q14: `java HelloServer` then `java HelloClient` (port 5000). The same HelloServer includes the Q14 message-reading modification.
- Q15: `java EchoServer` then `java EchoClient` (port 5001).
- Q16, Q17: `java MessageReceiver` then `java MessageSender` (UDP port 6000).
- Q20: `java MultiClientServer`, then run `java MultiClientClient Hello` from several terminals (port 5002). Stop server with Ctrl+C.
- Q18 and Q19 require internet access. The worksheet's sample `https://www.example.com/sample.txt` may not exist; a 404 is expected unless a valid file URL is supplied.

Shared JavaBeans:
- Q06: `java AccountBean`
- Q07: `java Q07_AccountChangeDemo` (uses AccountBean)
- Q08: `java Q08_StudentIntrospector` (uses StudentBean)


## Sample output

See `SAMPLE_OUTPUTS.txt`. It contains program output captured from actual runs where possible.
Network programs may need local ports and active server/client processes. Exact IP/host, date, collection ordering, and internet content can differ by machine.

## Submission

The `src` directory is suitable for uploading to GitHub. Do not upload compiled `.class` files.
Source code is for educational laboratory demonstrations; edit example records if needed.
