# Executable CV

One of the presumably many CV or resume management tools created by funemployed programmers

## Usage

Use lein deps to install node modules, and lein cljsbuild to compile

`node target/cljsbuild-main.js` will produce an html version of the resume in `ecv.data/cvdata`

The html resume can be converted to pdf using wkhtmltopdf.

`node target/cljsbuild-main.js <email> <attach> <subject-file> <body-file>` will send an email with the given subject, body, and attachment to the given address.
