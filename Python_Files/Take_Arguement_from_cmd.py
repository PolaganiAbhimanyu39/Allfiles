from argparse import ArgumentParser
parser = ArgumentParser()
parser.add_argument("-a", "--action", required=True, type=str, choices=["d", "e"],
                    help="Decrypt or Encrypt")
parser.add_argument("-i", "--input", required=True, type=str, help="input path")
parser.add_argument("-o", "--output", required=True, type=str, help="output path")
parser.add_argument("-k", "--key", required=True, type=int, help="key")

args = parser.parse_args()
input_path = args.input
