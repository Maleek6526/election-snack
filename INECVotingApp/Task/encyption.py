import string


def encrypt_text(word):
    result = ""
    for character in word:
        if 'a' <= character <= 'z':
            result += chr((ord(character) - ord('a') + 13) % 26 + ord('a'))
        elif 'A' <= character <= 'Z':
            result += chr((ord(character) - ord('A') + 13) % 26 + ord('A'))
        else:
            result += character
    return result

if __name__ == '__main__':
    print(encrypt_text("Hello World!"))