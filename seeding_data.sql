-- Insert genres
INSERT INTO genres (name) VALUES 
('Fiction'), ('Non-Fiction'), ('Science Fiction'), ('Mystery'), ('Romance');

-- Insert authors
INSERT INTO authors (name, birth_date, biography) VALUES
('J.K. Rowling', '1965-07-31', 'British author best known for the Harry Potter series.'),
('George Orwell', '1903-06-25', 'English novelist and essayist, best known for 1984 and Animal Farm.'),
('Agatha Christie', '1890-09-15', 'English crime novelist, short story writer, and playwright.'),
('Stephen King', '1947-09-21', 'American author of horror, supernatural fiction, suspense, and fantasy novels.');

-- Insert books
INSERT INTO books (title, author, isbn, publication_date, genre, description, price) VALUES
('Harry Potter and the Philosopher''s Stone', 'J.K. Rowling', '9780747532743', '1997-06-26', 'Fiction', 'The first book in the Harry Potter series.', 15.99),
('1984', 'George Orwell', '9780451524935', '1949-06-08', 'Fiction', 'A dystopian social science fiction novel.', 12.99),
('Murder on the Orient Express', 'Agatha Christie', '9780007119318', '1934-01-01', 'Mystery', 'A detective novel featuring Hercule Poirot.', 10.99),
('The Shining', 'Stephen King', '9780307743657', '1977-01-28', 'Horror', 'A horror novel set in an isolated hotel.', 14.99);

-- Insert book-author relationships
INSERT INTO book_authors (book_id, author_id) VALUES
(1, 1), -- Harry Potter - J.K. Rowling
(2, 2), -- 1984 - George Orwell
(3, 3), -- Murder on the Orient Express - Agatha Christie
(4, 4); -- The Shining - Stephen King


-- Insert more genres
INSERT INTO genres (name) VALUES 
('Thriller'), ('Biography'), ('Fantasy'), ('Historical Fiction'), ('Self-Help');

-- Insert more authors
INSERT INTO authors (name, birth_date, biography) VALUES
('Jane Austen', '1775-12-16', 'English novelist known for her romance fiction set among the landed gentry.'),
('Ernest Hemingway', '1899-07-21', 'American novelist and short story writer, known for his economical and understated style.'),
('Haruki Murakami', '1949-01-12', 'Japanese writer, his works are characterized by a surrealistic style.'),
('Margaret Atwood', '1939-11-18', 'Canadian poet, novelist, and environmental activist.'),
('Neil Gaiman', '1960-11-10', 'English author of short fiction, novels, comic books, and films.');

-- Insert more books
INSERT INTO books (title, author, isbn, publication_date, genre, description, price) VALUES
('Pride and Prejudice', 'Jane Austen', '9780141439518', '1813-01-28', 'Romance', 'A romantic novel of manners.', 9.99),
('The Old Man and the Sea', 'Ernest Hemingway', '9780684801223', '1952-09-01', 'Fiction', 'Story of an aging Cuban fishermans struggle with a giant marlin.', 11.99),
('1Q84', 'Haruki Murakami', '9780307593313', '2011-10-25', 'Science Fiction', 'A story about a woman who enters a parallel existence.', 16.99),
('The Handmaid''s Tale', 'Margaret Atwood', '9780385490818', '1985-06-14', 'Dystopian Fiction', 'Set in a near-future New England in a totalitarian state.', 13.99),
('American Gods', 'Neil Gaiman', '9780380789030', '2001-06-19', 'Fantasy', 'A blend of Americana, fantasy, and mythology.', 12.99);

-- Insert more book-author relationships
INSERT INTO book_authors (book_id, author_id) VALUES
(5, 5), -- Pride and Prejudice - Jane Austen
(6, 6), -- The Old Man and the Sea - Ernest Hemingway
(7, 7), -- 1Q84 - Haruki Murakami
(8, 8), -- The Handmaid's Tale - Margaret Atwood
(9, 9); -- American Gods - Neil Gaiman



-- Insert more genres
INSERT INTO genres (name) VALUES 
('Poetry'), ('Horror'), ('Adventure'), ('Classics'), ('Contemporary'),
('Cookbook'), ('Graphic Novel'), ('Young Adult'), ('Travel'), ('Philosophy'),
('Science'), ('Art'), ('Business'), ('Humor'), ('True Crime');

-- Insert more authors
INSERT INTO authors (name, birth_date, biography) VALUES
('Gabriel García Márquez', '1927-03-06', 'Colombian novelist, short-story writer, screenwriter and journalist.'),
('Virginia Woolf', '1882-01-25', 'English writer, considered one of the most important modernist 20th-century authors.'),
('Leo Tolstoy', '1828-09-09', 'Russian writer who is regarded as one of the greatest authors of all time.'),
('Toni Morrison', '1931-02-18', 'American novelist, essayist, editor, and professor.'),
('Kazuo Ishiguro', '1954-11-08', 'British novelist, screenwriter, and short-story writer.'),
('Chimamanda Ngozi Adichie', '1977-09-15', 'Nigerian writer of novels, short stories, and nonfiction.'),
('Jorge Luis Borges', '1899-08-24', 'Argentine short-story writer, essayist, poet and translator.'),
('Ursula K. Le Guin', '1929-10-21', 'American author best known for her works of speculative fiction.'),
('Salman Rushdie', '1947-06-19', 'British Indian novelist and essayist.'),
('Isabel Allende', '1942-08-02', 'Chilean writer, famous for novels such as The House of the Spirits.');

-- Insert more books
INSERT INTO books (title, author, isbn, publication_date, genre, description, price) VALUES
('One Hundred Years of Solitude', 'Gabriel García Márquez', '9780060883287', '1967-05-30', 'Magical Realism', 'The multi-generational story of the Buendía family.', 14.99),
('Mrs Dalloway', 'Virginia Woolf', '9780156628709', '1925-05-14', 'Modernist', 'A day in the life of Clarissa Dalloway in post-World War I England.', 12.99),
('War and Peace', 'Leo Tolstoy', '9781400079988', '1869-01-01', 'Historical Fiction', 'Epic novel about Russian society during the Napoleonic Era.', 18.99),
('Beloved', 'Toni Morrison', '9781400033416', '1987-09-02', 'Historical Fiction', 'A novel inspired by the life of Margaret Garner, an African American who escaped slavery.', 15.99),
('Never Let Me Go', 'Kazuo Ishiguro', '9781400078776', '2005-03-03', 'Science Fiction', 'A dystopian science fiction novel.', 13.99),
('Americanah', 'Chimamanda Ngozi Adichie', '9780307455925', '2013-05-14', 'Contemporary Fiction', 'A novel that tells the story of a young Nigerian woman who emigrates to the United States.', 14.99),
('The Aleph', 'Jorge Luis Borges', '9780142437889', '1949-01-01', 'Short Stories', 'A collection of short stories by Borges.', 11.99),
('The Left Hand of Darkness', 'Ursula K. Le Guin', '9780441478125', '1969-03-01', 'Science Fiction', 'A science fiction novel part of the Hainish Cycle.', 12.99),
('Midnight''s Children', 'Salman Rushdie', '9780812976533', '1981-04-01', 'Magical Realism', 'A book dealing with India''s transition from British colonialism to independence.', 16.99),
('The House of the Spirits', 'Isabel Allende', '9780553383809', '1982-01-01', 'Magical Realism', 'The story of the Trueba family spanning three generations.', 14.99);

-- Insert more book-author relationships
INSERT INTO book_authors (book_id, author_id) VALUES
(10, 10), (11, 11), (12, 12), (13, 13), (14, 14),
(15, 15), (16, 16), (17, 17), (18, 18), (19, 19);

-- Insert even more books (with existing authors for variety)
INSERT INTO books (title, author, isbn, publication_date, genre, description, price) VALUES
('Love in the Time of Cholera', 'Gabriel García Márquez', '9780307389732', '1985-01-01', 'Romance', 'A love story that spans fifty years.', 13.99),
('To the Lighthouse', 'Virginia Woolf', '9780156907392', '1927-05-05', 'Modernist', 'A landmark novel of high modernism.', 11.99),
('Anna Karenina', 'Leo Tolstoy', '9780143035008', '1877-01-01', 'Classics', 'A complex novel in eight parts.', 15.99),
('Song of Solomon', 'Toni Morrison', '9781400033423', '1977-01-01', 'Fiction', 'A novel about the African-American experience in the United States.', 14.99),
('The Remains of the Day', 'Kazuo Ishiguro', '9780679731726', '1989-05-01', 'Historical Fiction', 'A novel about a butler''s reminiscences of his service during World War II.', 12.99);

-- Insert corresponding book-author relationships
INSERT INTO book_authors (book_id, author_id) VALUES
(20, 10), (21, 11), (22, 12), (23, 13), (24, 14);


