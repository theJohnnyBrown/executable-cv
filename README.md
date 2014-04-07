# Executable CV

One of the presumably many CV or resume management tools created by funemployed programmers

## Usage

Assuming npm is installed, `npm install ecv` followed by `./node_modules/.bin/ecv > index.html` will save an HTML version of my resume to `index.html`.

## Building

Use lein deps to install node modules, and lein cljsbuild to compile

`node target/cljsbuild-main.js` will produce an html version of the resume in `ecv.data/cvdata`

The html resume can be converted to pdf using wkhtmltopdf.

`node target/cljsbuild-main.js <email> <attach> <subject-file> <body-file>` will send an email with the given subject, body, and attachment to the given address.

## TODO

 + Take json or edn file as input for cvdata
 + Convert email body-file from markdown to html
