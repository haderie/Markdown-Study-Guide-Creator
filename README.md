# PA01 Summarize this!
**Compiles FORMATED markdown note files into one whole study-guide.**

It includes several additional tools:
1. Gradle Build Automation
1. JaCoCo for Test Coverage
1. CheckStyle for Code Style Checks (Using the custom [cs3500 check file](./config/checkstyle/cs3500-checkstyle.xml))

## Format
- #, ##, ###, and #### represent different levels of headings. 
- The `-` indicates a bullet point and bullet points can be nested as well.
- sentences or phrases are enclosed in double square brackets: [[...]].  This is a way to draw attention to particularly important points that the note-taker realizes they’ll definitely need to study later.

## Program Input
The program takes three (3) command-line arguments:

1. A **relative or absolute path** to a folder (directory) of markdown files containing the notes you want to summarize.
2. **Ordering Flag** - A flag to indicate how the summary document should be organized
    1. `filename` - organizes content in the output summary file in order based on the alphabetically sorted source file names. 
    2. `created` - organizes content in the output summary file in order based on the create-date time of the source file. 
    3. `modified` - organizes content in the output summary file in order based on the the last modified time of the source file
3. **An output path** (relative or absolute) and filename of where to write the study guide your program generates. Based on the input file processing order dictated by command-line argument #2 above, the output file will contain:
    1. all headings in the order they appear in the file (properly nested). 
        1. Except for the very first line of the study guide file, all headings should be preceded with a blank line. 
    2. all important phrases identified with the `[[]]` properly nested under the heading in which it appears in the original input file. 
        1. In the output file, do not output the brackets themselves. 
        2. Each bracketed phrase should be output as a single bullet point (`-`) in the output file. 
        3. Bracketed phrases or sentences may span multiple lines of the input file. 
        4. A single line of the input file may contain multiple bracketed important phrases; each should be output as a separate bullet point in the study guide
## Sample input and Output
### Input:
<img width="616" alt="Screenshot 2023-09-14 at 1 15 44 PM" src="https://github.com/haderie/Markdown-Study-Guide-Creator/assets/126923741/e08b1050-4196-451a-9dfa-2fe5258aac17">
<img width="612" alt="Screenshot 2023-09-14 at 1 16 26 PM" src="https://github.com/haderie/Markdown-Study-Guide-Creator/assets/126923741/5c60893e-e23e-4b80-9f09-96990407dda3">

### Output:
<img width="690" alt="Screenshot 2023-09-14 at 1 13 58 PM" src="https://github.com/haderie/Markdown-Study-Guide-Creator/assets/126923741/95003a57-bf7e-4447-98db-12fb00b187ba">
