DROP TABLE IF EXISTS Playlist_Detail;
DROP TABLE IF EXISTS Playlist;
DROP TABLE IF EXISTS Song;
DROP TABLE IF EXISTS User;
CREATE TABLE User (
  `Userid` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(60) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Userid`));


CREATE TABLE `Song` (
  `Songid` INT NOT NULL AUTO_INCREMENT,
  `Title` VARCHAR(45) NULL,
  `Singers` VARCHAR(45) NULL,
  `Albumn` VARCHAR(45) NULL,
  `Playtime` INT NULL,
  PRIMARY KEY (`Songid`));


CREATE TABLE `Playlist` (
  `Playlistid` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NULL,
  `Created` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `Userid` INT NOT NULL,
  PRIMARY KEY (`Playlistid`),
  CONSTRAINT `Userid`
    FOREIGN KEY (`Userid`)
    REFERENCES `User` (`Userid`));


CREATE TABLE `Playlist_Detail` (
  `Playlistid` INT NOT NULL,
  `Songid` INT NOT NULL,
  PRIMARY KEY (`Playlistid`, `Songid`),
  CONSTRAINT `Playlistid`
    FOREIGN KEY (`Playlistid`)
    REFERENCES `Playlist` (`Playlistid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Songid`
    FOREIGN KEY (`Songid`)
    REFERENCES `Song` (`Songid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

INSERT INTO `User` (`Userid`, `Name`, `Email`, `Password`) VALUES ('1', 'Sam', 'sam@gmail.com', 'admin');
INSERT INTO `User` (`Userid`, `Name`, `Email`, `Password`) VALUES ('2', 'Jay', 'jay@gmail.com', 'user');


INSERT INTO `Song` (`Songid`, `Title`, `Singers`, `Albumn`, `Playtime`) VALUES ('1', 'Kunu Kune', 'Yesudas, Chithra', 'Yoddha', '226');
INSERT INTO `Song` (`Songid`, `Title`, `Singers`, `Albumn`, `Playtime`) VALUES ('2', 'Snehithane', 'Srinivas, Sadhana Sargam', 'Alai Payuthey', '275');
INSERT INTO `Song` (`Songid`, `Title`, `Singers`, `Albumn`, `Playtime`) VALUES ('3', 'Pachai Nirame', 'Hariharan', 'Alai Payuthey', '354');

INSERT INTO `Playlist` (`Name`, `Userid`) VALUES ('Playlist_1', '1');
INSERT INTO `Playlist` (`Name`, `Userid`) VALUES ('Playlist_2', '1');

INSERT INTO `Playlist_Detail` (`Playlistid`, `Songid`) VALUES ('1', '1');
INSERT INTO `Playlist_Detail` (`Playlistid`, `Songid`) VALUES ('1', '2');
INSERT INTO `Playlist_Detail` (`Playlistid`, `Songid`) VALUES ('1', '3');
INSERT INTO `Playlist_Detail` (`Playlistid`, `Songid`) VALUES ('2', '1');
INSERT INTO `Playlist_Detail` (`Playlistid`, `Songid`) VALUES ('2', '2');


