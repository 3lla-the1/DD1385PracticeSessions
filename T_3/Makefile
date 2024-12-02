# Variables
SOURCE = ButtonDisplay.nw
TEX_FILE = ButtonDisplay.tex
PDF_FILE = ButtonDisplay.pdf


all: $(PDF_FILE)

$(TEX_FILE): $(SOURCE)
	noweave -latex $(SOURCE) > $(TEX_FILE)

$(PDF_FILE): $(TEX_FILE)
	pdflatex $(TEX_FILE)


run:
	javac ButtonDisplay.java
	java ButtonDisplay

	
clean:
	rm -f $(TEX_FILE) $(PDF_FILE) *.aux *.log
